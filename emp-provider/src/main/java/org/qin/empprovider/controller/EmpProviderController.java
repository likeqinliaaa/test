package org.qin.empprovider.controller;

import lombok.RequiredArgsConstructor;
import org.qin.empprovider.service.EmpService;
import org.qin.model.Emp;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
@RequiredArgsConstructor
public class EmpProviderController{

    private final EmpService empService;

    @GetMapping("/get/{empno}")
    public Emp getByEmpno(@PathVariable("empno") String empno) {
        return empService.getById(Integer.valueOf(empno));
    }

    @PostMapping("/add")
    public Emp addEmp(@RequestBody Emp emp) {
        boolean saved = empService.save(emp);
        if (saved) {
            return emp;
        }
        return null;
    }
}
