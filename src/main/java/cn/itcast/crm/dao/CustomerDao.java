package cn.itcast.crm.dao;

import cn.itcast.crm.entity.Customer;

public interface CustomerDao {

	public Customer findById(Long id);

}
