package by.mycompany.beautysalon.dao;

import by.mycompany.beautysalon.dto.MasterDto;
import by.mycompany.beautysalon.entity.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MasterDao extends JpaRepository<Master, Integer> {

    Master findMasterByLastName(String lastName);
    Master findMasterById(Integer id);

    @Modifying
    @Query("delete from Master m where m.id = :id")
    void deleteCust(int id);
//    public Master getMasterByLastName(String lastName);
}
