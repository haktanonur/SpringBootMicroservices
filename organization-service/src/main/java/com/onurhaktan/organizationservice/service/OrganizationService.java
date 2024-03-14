package com.onurhaktan.organizationservice.service;

import com.onurhaktan.organizationservice.dto.OrganizationDto;
import com.onurhaktan.organizationservice.entity.Organization;

public interface OrganizationService {
    OrganizationDto saveOrganization(OrganizationDto organizationDto);
    OrganizationDto getOrganizationByCode(String organizationCode);
}
