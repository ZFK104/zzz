package cn.bdqn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Players {
    private int pid;
    private String pname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private int height;
    private int weight;
    private String position;
    private int cid;
    private String cname;
}
