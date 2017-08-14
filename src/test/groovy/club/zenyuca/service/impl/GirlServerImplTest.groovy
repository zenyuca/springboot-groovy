package club.zenyuca.service.impl

import club.zenyuca.entity.Girl
import club.zenyuca.service.GirlService
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner.class)
@SpringBootTest
class GirlServerImplTest {

    @Autowired
    GirlService girlService

    @Test
    void testGetById() {
        Girl girl = this.girlService.getById(1)
        Assert.assertEquals(new Integer(18), girl.getAge())
    }
}
