package levvel.io.service;

import levvel.io.exception.BlogNotExistException;
import levvel.io.model.Blog;

public interface BlogService {

    void addBlog(Blog blog);

    Blog getBlog(String id) throws BlogNotExistException;
}
