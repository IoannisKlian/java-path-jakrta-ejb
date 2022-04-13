/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codelearn.java.path.jakarta.ejb.service;

import javax.ejb.Remote;

/**
 *
 * @author giannis
 */
@Remote
public interface ViewsCounterService {
    Integer getNumOfViews();
    void incrementNumberOfViews();
}
