package club.zenyuca.service.impl

import club.zenyuca.entity.Girl
import club.zenyuca.repository.GirlRepository
import club.zenyuca.service.GirlService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GirlServerImpl implements GirlService{

    @Autowired
    GirlRepository girlRepository


    @Override
    List<Girl> getGirls() {
        return this.girlRepository.findAll()
    }

    @Override
    Girl getById(Integer id) {
        return this.girlRepository.findOne(id)
    }

    @Override
    Girl addGirl(Girl girl) {
        return this.girlRepository.save(girl)
    }

    @Override
    Girl updateGirl(Girl girl) {
        return this.girlRepository.save(girl)
    }

    @Override
    void delGirl(Integer id) {
        this.girlRepository.delete(id)
    }
}
