package com.nf.demo.entity;

import lombok.Data;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author
 * @ClassName lwb
 * @Description TODO
 * @Date 2019/11/21 19:35
 */
@Data
public class EmployeeEntity {
private Integer employeeid;
    @NotEmpty
    @Size(min = 1,max = 20)
    private String username;
    @Min(0)
    private BigDecimal salary;
    @Past
    private Date hiredate;
}
