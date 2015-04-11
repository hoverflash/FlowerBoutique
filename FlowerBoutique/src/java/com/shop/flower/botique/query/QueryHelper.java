/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shop.flower.botique.query;

import com.shop.flower.entity.Customer;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hover
 */
@Repository
public class QueryHelper {
    
    private HibernateTemplate hibernateTemplate;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }
    
//    public List<Customer> getCategory(String number){
//        return hibernateTemplate.find("from " + Customer.class.getName());
//    }
    
    public Customer getCustomerbyid(Integer id){
        DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
        criteria.add(Restrictions.eq("id", id));
        List<Object> result = hibernateTemplate.findByCriteria(criteria);
        Customer uploader = (Customer) (result==null||result.isEmpty()?null:result.get(0));
        return uploader;
    }
    
}
