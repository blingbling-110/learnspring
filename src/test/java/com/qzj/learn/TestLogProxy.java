package com.qzj.learn;

import com.qzj.impl.TimeBookInterface;

public class TestLogProxy {
    public static void main(String[] args) {
        LogProxy logProxy = new LogProxy();
        TimeBookInterface tbi = (TimeBookInterface) logProxy.bind(new TimeBook());
        tbi.doAuditing("Spring");
    }
}
