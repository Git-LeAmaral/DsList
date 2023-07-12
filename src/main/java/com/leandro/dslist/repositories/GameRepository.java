package com.leandro.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandro.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
