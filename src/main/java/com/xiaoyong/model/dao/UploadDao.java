package com.xiaoyong.model.dao;

import com.xiaoyong.model.entity.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : XiaoYong
 * @date : 2018/3/30 13:46
 * Description    :
 */

@Repository
public interface UploadDao extends CrudRepository<Image,Integer> {

    Image findImageByImageId(Integer imageId);

    @Override
    @SuppressWarnings("unchecked")
    Image save(Image image);

}
