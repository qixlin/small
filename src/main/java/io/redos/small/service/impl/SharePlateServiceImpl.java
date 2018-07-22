package io.redos.small.service.impl;

import io.redos.small.dao.SharePlateDao;
import io.redos.small.model.SharePlate;
import io.redos.small.service.SharePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SharePlateServiceImpl implements SharePlateService {

    @Autowired
    private SharePlateDao sharePlateDao;
    @Override
    public long add(SharePlate sp) {
        return sharePlateDao.addSharePlate(sp);
    }
}
