package org.qin.empconsumer.controller;

import lombok.RequiredArgsConstructor;
import org.qin.client.EmpServiceFeign;
import org.qin.model.Emp;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
@RequiredArgsConstructor
public class EmpConsumerController {

    private final EmpServiceFeign empServiceFeign;

    @GetMapping("/get/{empno}")
    public Emp getByEmpno(@PathVariable String empno) {
        return empServiceFeign.getByEmpno(empno);
    }

    @PostMapping("/add")
    public Emp addEmp(@RequestBody Emp emp) {
        return empServiceFeign.addEmp(emp);
    }
}
