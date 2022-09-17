package ru.itmo.soa.firstservice.common;

public interface Endpoints {

    // create or update organization
    String ORGANIZATIONS = "/organizations";

    // get or delete specified organization by id
    String ORGANIZATION_BY_ID = "/organizations/{organizationId}";

    // filter organizations by all fields
    String FILTER_ORGANIZATIONS = "/organizations/filter";

    // clear all objects whose officialAddress field value is equivalent to the specified one
    String CLEAR_ORGANIZATIONS_BY_ADDRESS = "/organizations/clear/{officialAddress}";

    // delete specified organization by officialAddress
    String DELETE_ORGANIZATION_BY_ADDRESS = "/organizations/delete/{officialAddress}";

    // get specified organization with max officialAddress
    String SEARCH_ORGANIZATION_BY_MAX_ADDRESS = "/organizations/search";

}