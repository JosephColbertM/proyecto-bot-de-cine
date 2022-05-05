package com.botcine.bot_cine.dao;

import com.botcine.bot_cine.dto.PeliculasDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PeliculasDao {
    @Select("SELECT ca, nombre, apellido, usuario, password FROM peliculas")
    public List<PeliculasDto> findAllPeliculas();

    @Select("SELECT p.pet_id, p.pet_name, p.pet_tipe, p.pet_age, p.pet_gender,p.pet_stat, p.pet_care, p.pet_contacts, p.pet_image, p.state ,p.mod_user, p.mod_date, p.usuario_id_usuario " +
            "FROM pet p JOIN usuario u  ON p.usuario_id_usuario = u.id_usuario WHERE u.telegram_id = #{userid} AND p.state = 1")
    public List<PeliculasDto> findPets(@Param("cp") Integer id);





    @Insert("INSERT INTO pet(pet_name, pet_tipe, pet_age, pet_gender, pet_stat, pet_care, pet_contacts,pet_image, state,mod_user,mod_date,usuario_id_usuario) " +
            " VALUES ( #{pet_name}, #{pet_tipe}, #{pet_age}, #{pet_gender}, #{pet_stat}, #{pet_care}, #{pet_contacts}, #{pet_image}, 1,'rene',CURRENT_TIMESTAMP,"+
            " (SELECT u.id_usuario FROM usuario u WHERE u.telegram_id = #{userid} AND u.state = 1)) ")
        //void savePet(PetListDto petListDto,@Param("userid") Integer id);
    void savePeliculas(@Param("nombre") String nombre, @Param("duracion") String duracion, @Param("genero") String genero, @Param("cp") Integer id);
}


