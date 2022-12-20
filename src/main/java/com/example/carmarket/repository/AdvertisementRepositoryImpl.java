package com.example.carmarket.repository;

import com.example.carmarket.model.Advertisement;
import com.example.carmarket.repository.interfaces.AdvertisementRepository;
import com.example.carmarket.util.CarMarkerUtils;
import lombok.RequiredArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

@Repository
@ThreadSafe
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AdvertisementRepositoryImpl implements AdvertisementRepository<Long, Advertisement> {
    private final Map<Long, Advertisement> advertisements = new ConcurrentHashMap<>();

    @Override
    public Advertisement add(Advertisement advertisement) {
        long id = CarMarkerUtils.generatedId();

        advertisement.setId(id);
        advertisement.setCreated(LocalDateTime.now());

        return advertisements.putIfAbsent(id, advertisement);
    }

    @Override
    public boolean delete(Long id) {
        return Objects.nonNull(advertisements.remove(id));
    }

    @Override
    public boolean update(Long id, Advertisement advertisement) {
        return false;
    }

    @Override
    public List<Advertisement> getAll() {
        return new ArrayList<>(advertisements.values());
    }

    @Override
    public Advertisement getById(Long id) {
        return advertisements.get(id);
    }
}
