package club.zenyuca.service

import club.zenyuca.entity.Girl
import org.springframework.stereotype.Service

interface GirlService {
    List<Girl> getGirls()
    Girl getById(Integer id)
    Girl addGirl(Girl girl)
    Girl updateGirl(Girl girl)
    void delGirl(Integer id)
}
