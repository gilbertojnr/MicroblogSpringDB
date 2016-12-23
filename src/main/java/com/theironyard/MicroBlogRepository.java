package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by gilbertakpan on 12/21/16.
 */
public interface MicroBlogRepository extends CrudRepository<Message, Integer>{
}
