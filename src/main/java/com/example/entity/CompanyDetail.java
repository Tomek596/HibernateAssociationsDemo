package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "company_detail")
public class CompanyDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_company_detail")
    private Integer idCompanyDetail;

    @Column(name = "residence")
    private String residence;

    @Column(name = "employee_number")
    private Integer employeeNumber;

    public CompanyDetail() {
    }

    public CompanyDetail(String residence, Integer employeeNumber) {
        this.residence = residence;
        this.employeeNumber = employeeNumber;
    }

    public Integer getIdCompanyDetail() {
        return idCompanyDetail;
    }

    public void setIdCompanyDetail(Integer idCompanyDetail) {
        this.idCompanyDetail = idCompanyDetail;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return "CompanyDetail{" +
                "idCompanyDetail=" + idCompanyDetail +
                ", residence='" + residence + '\'' +
                ", employeeNumber=" + employeeNumber +
                '}';
    }
}
