package cn.campsg.java.experiment;

import cn.campsg.java.experiment.entity.Employe;
import cn.campsg.java.experiment.entity.Hrstaff;

public class MainClass {
    public static void main(String[] args) {
        Employe employe=new Employe("南帝",12,7000);
        Hrstaff hrstaff=new Hrstaff("hr");
        Company company = new Company();
        company.appraisals(employe);
        company.appraisals(hrstaff);
    }
}
