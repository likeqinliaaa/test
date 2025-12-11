package org.qin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDate;

@Data
@TableName("emp")
public class Emp{
    @TableId(value = "empno", type = IdType.AUTO)
    private Integer empno;
    private String ename;
    private LocalDate hiredate;
    private Integer sal;
}
