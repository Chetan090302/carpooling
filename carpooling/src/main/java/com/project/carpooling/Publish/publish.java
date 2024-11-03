package com.project.carpooling.Publish;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Table(name="publish1")
public class publish
{
    @Id
    public String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date date;
    public List<String> locations=new ArrayList<>();
    public Integer amount;
    public String Message;
    public Integer seats;
}
