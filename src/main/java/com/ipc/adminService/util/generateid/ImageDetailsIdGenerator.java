package com.ipc.adminService.util.generateid;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImageDetailsIdGenerator implements IdentifierGenerator{

    final Logger logger = LoggerFactory.getLogger(UserIdGenerator.class);
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "imgpathid";
        Connection connection = session.connection();

        try (Statement statement=connection.createStatement()){

            ResultSet rs=statement.executeQuery("select count(imgpathid) as Id from imagelocation");

            if(rs.next())
            {
                int id=rs.getInt(1)+101;
                // +  new Integer(id).toString()
                String generatedId = prefix + Integer.toString(id) ;
                logger.info("Generated Id: {}", generatedId);
                return generatedId;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
	}


