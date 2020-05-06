package io.jingwei.basis.biz.service.impl;

import io.jingwei.basis.base.util.SystemClock;
import io.jingwei.basis.biz.service.ISystemService;
import org.springframework.stereotype.Service;

@Service
public class SystemServiceImpl implements ISystemService {
    @Override
    public long getSystemTime() {
        return SystemClock.INSTANCE.currentTimeMillis();
    }
}
