/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codelearn.java.path.jakarta.ejb.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author giannis
 */
@Slf4j
@Stateful
public class ViewsCounterServiceImplStatefullBean implements ViewsCounterService {
    private Integer numberOfViews;

    @PostConstruct
    private void init() {
        numberOfViews = 0;
        log.info("Class {} has been intiliazed", getClass().getName());
    }

    @PreDestroy
    private void destroy() {
        log.info("Class {} is being destroyed", getClass().getName());
    }
    
    @PostActivate
    private void postActivate(){
        log.info("Class {} is being post activated", getClass().getName());
    }
    
    @PrePassivate
    private void prePassivate(){
        log.info("Class {} is being pre passivated", getClass().getName());
    }

    @Override
    public Integer getNumOfViews() {
        return numberOfViews;
    }

    @Override
    public void incrementNumberOfViews() {
        numberOfViews++;
        log.info("Views Class {} incremented to total {}", getClass().getName(),numberOfViews);
    }
}
