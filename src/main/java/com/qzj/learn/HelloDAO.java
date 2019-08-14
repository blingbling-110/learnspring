package com.qzj.learn;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;

public class HelloDAO {
    private DataSource dataSource;

    //进行编程式事务处理
//    private PlatformTransactionManager transactionManager;
//
//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    public void setTransactionManager(PlatformTransactionManager transactionManager) {
//        this.transactionManager = transactionManager;
//    }
//
//    public int create(String msg) {
//        TransactionTemplate transactionTemplate = new TransactionTemplate(transactionManager);
//        Object result = transactionTemplate.execute(new TransactionCallback() {
//            @Override
//            public Object doInTransaction(TransactionStatus transactionStatus) {
//                //执行新增的操作，向数据库新增一笔记录
//                JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//                int resultObject = jdbcTemplate.update(
//                        "insert into hello values(1, 'gf', 'HelloWord')");
//                return resultObject;
//            }
//        });
//        return (int) result;
//    }

    //自己进行回滚、提交
//    public int create(String msg) {
//        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
//        TransactionStatus status = transactionManager.getTransaction(def);
//        int result = 0;
//        try {
//            //使用JdbcTemplate往数据库里新增数据
//            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//            result = jdbcTemplate.update(
//                    "insert into hello values(1, 'gf', 'HelloWord')");
//        } catch (DataAccessException ex) {
//            //也可以执行status.setRollbackOnly();
//            transactionManager.rollback(status);
//            throw ex;
//        }finally {
//            transactionManager.commit(status);
//        }
//        return result;
//    }

    //利用TransactionCallback的另一个实现类TransactionCallbackWithoutResult
//    public void create(String msg) {
//        TransactionTemplate transactionTemplate = new TransactionTemplate(transactionManager);
//        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//            @Override
//            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
//                JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//                jdbcTemplate.update("insert into hello values(1, 'gf', 'HelloWord')");
//            }
//        });
//    }

    //进行声明式事务处理
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    //注意这里看不到事务处理的代码，一切都在配置文件中
    public void create(String msg) {
        jdbcTemplate.update("insert into hello values(1, 'gf', 'HelloWord')");
    }
}
