package com.project.carpooling.Publish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;


@Service
public class PublishService
{
    @Autowired
    PublishRepo repo;

    public void saveride(publish obj)
    {
        repo.save(obj);
    }

    public List<publish> getAllrides()
    {
        return repo.findAll();
    }

    public List<publish> getridebyfilter(String source,String destination)
    {
        List<publish> lis=repo.findAll();
        List<publish> res=new ArrayList<>();
        for(publish al:lis)
        {
            List<String> list=al.getLocations();
            int index1=list.indexOf(source);
            int index2=list.indexOf(destination);
            if(index1!=-1&&index2!=-1&&index1<index2)
            {
                res.add(al);
            }
        }
        return res;
    }
}
