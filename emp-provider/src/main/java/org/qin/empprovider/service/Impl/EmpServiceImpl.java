package org.qin.empprovider.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.qin.empprovider.mapper.EmpMapper;
import org.qin.empprovider.service.EmpService;
import org.qin.model.Emp;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {

}
