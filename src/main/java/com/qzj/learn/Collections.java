package com.qzj.learn;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collections {
    private List list = null;
    private Set set = null;
    private Map map = null;
    private Properties props = null;

    public void setProps(Properties props) {
        this.props = props;
    }

    public Properties getProps() {
        return props;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Map getMap() {
        return map;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Set getSet() {
        return set;
    }

    public void setList(List list) {
        this.list = list;
    }

    public List getList() {
        return list;
    }
}
