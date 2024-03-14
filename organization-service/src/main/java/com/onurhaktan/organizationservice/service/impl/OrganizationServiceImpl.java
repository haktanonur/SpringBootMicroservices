package com.onurhaktan.organizationservice.service.impl;

import com.onurhaktan.organizationservice.dto.OrganizationDto;
import com.onurhaktan.organizationservice.entity.Organization;
import com.onurhaktan.organizationservice.mapper.OrganizationMapper;
import com.onurhaktan.organizationservice.repository.OrganizationRepository;
import com.onurhaktan.organizationservice.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);

        Organization savedOrganization = organizationRepository.save(organization);

        return OrganizationMapper.mapToOrganizationDto(savedOrganization);

    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
