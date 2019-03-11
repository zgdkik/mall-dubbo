package  com.zscat.cms.impl;

import com.zscat.cms.mapper.CmsPrefrenceAreaMapper;
import com.zscat.cms.model.CmsPrefrenceArea;
import com.zscat.cms.model.CmsPrefrenceAreaExample;
import com.zscat.cms.service.CmsPrefrenceAreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品优选Service实现类
 * Created by zscat on 2018/6/1.
 */
@Service("cmsPrefrenceAreaService")
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Resource
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
