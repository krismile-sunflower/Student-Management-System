package com.example.demo.dao;

import com.example.demo.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookDao {

    /**
     * 新增一本书
     * @param book book
     * @return 添加行数
     */
    int addBook(Book book);

    /**
     * 根据id删除一本书
     * @param id book id
     * @return 删除行数
     */
    int deleteById(Integer id);

    /**
     * 修改一本书
     * @param book book对象
     * @return 添加行数
     */
    int updateBook(Book book);

    /**
     * 根据id查询
     * @param id 查询id
     * @return 查询的 book对象
     */
    Book queryById(Integer id);

    /**
     * 查询所有书
     * @return book列表
     */
    List<Book> queryAllBook();

}
