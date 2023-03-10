package com.lion.pinepeople.repository;

import com.lion.pinepeople.domain.entity.BlackList;
import com.lion.pinepeople.domain.entity.User;
import com.lion.pinepeople.enums.BlackListStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.stream.DoubleStream;

public interface BlackListRepository extends JpaRepository<BlackList, Long> {
    Optional<BlackList> findByUser(User targetUser);
    Optional<BlackList> findByUser_Phone(String email);
    Page<BlackList> findAllByStatus(PageRequest pageable, BlackListStatus status);
}
