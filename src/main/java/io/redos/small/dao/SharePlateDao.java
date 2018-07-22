package io.redos.small.dao;

import io.redos.small.model.SharePlate;
import org.springframework.stereotype.Repository;

@Repository
public interface SharePlateDao {

    long addSharePlate(SharePlate sharePlate);
}
