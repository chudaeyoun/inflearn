package com.example.demo.redisimport org.springframework.data.redis.core.RedisHashimport javax.persistence.Id@RedisHash("accounts")class RedisAccount(    @Id    val id: Long,    val username: String,    val email: String)