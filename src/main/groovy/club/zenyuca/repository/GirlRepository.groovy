package club.zenyuca.repository

import club.zenyuca.entity.Girl
import org.springframework.data.jpa.repository.JpaRepository

interface GirlRepository extends JpaRepository<Girl, Integer> {
}
