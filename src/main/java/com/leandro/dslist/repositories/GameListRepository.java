package com.leandro.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandro.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
