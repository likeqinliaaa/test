package org.qin.client;

import org.qin.model.Emp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(value = "emp-provider", path = "/emp")
public interface EmpServiceFeign {

    @GetMapping("/get/{empno}")
    Emp getByEmpno(@PathVariable("empno") String empno);

    @PostMapping("/add")
    Emp addEmp(@RequestBody Emp emp);
}
