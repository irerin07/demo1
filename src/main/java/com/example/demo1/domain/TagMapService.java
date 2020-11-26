package com.example.demo1.domain;

import com.example.demo1.domain.query.TagMappingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TagMapService {
    private final TagMappingRepository tagMappingRepository;

    public void testTagMap(){
        List<TagMapping> tagMappingList = new ArrayList<>();
        for(int i = 0; i < 10; i ++){
            TagMapping tagMapping = TagMapping.builder().item(i).itemRule(i).tag(i).build();
            tagMappingList.add(tagMapping);
        }
        tagMappingRepository.saveAll(tagMappingList);

        List<TagMapping> all = tagMappingRepository.findAll();

        List<Integer> collect = all.stream().map(tagMapping -> tagMapping.getTag()).collect(Collectors.toList());
        List<Integer> newCollect = new ArrayList<>();
        for(int i = 0; i < 12; i ++){

            newCollect.add(i);
        }
        newCollect.removeAll(collect);
        for (Integer integer : newCollect) {
            System.out.println("integer = " + integer);
        }
    }
}
