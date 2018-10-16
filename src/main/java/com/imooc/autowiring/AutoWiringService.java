package com.imooc.autowiring;

public class AutoWiringService {
    private AutoWiringDAO autoWiringDAO;


    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        this.autoWiringDAO = autoWiringDAO;
    }

    public void say(String word) {
        this.autoWiringDAO.say(word);
    }
}
