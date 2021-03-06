# ActivitiesApi

All URIs are relative to *https://developer.api.autodesk.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createActivity**](ActivitiesApi.md#createActivity) | **POST** /autocad.io/us-east/v2/Activities | Creates a new Activity.
[**deleteActivity**](ActivitiesApi.md#deleteActivity) | **DELETE** /autocad.io/us-east/v2/Activities(&#39;{id}&#39;) | Removes a specific Activity.
[**deleteActivityHistory**](ActivitiesApi.md#deleteActivityHistory) | **POST** /autocad.io/us-east/v2/Activities(&#39;{id}&#39;)/Operations.DeleteHistory | Removes the version history of the specified Activity.
[**getActivity**](ActivitiesApi.md#getActivity) | **GET** /autocad.io/us-east/v2/Activities(&#39;{id}&#39;) | Returns the details of a specific Activity.
[**getActivityVersions**](ActivitiesApi.md#getActivityVersions) | **GET** /autocad.io/us-east/v2/Activities(&#39;{id}&#39;)/Operations.GetVersions | Returns all old versions of a specified Activity.
[**getAllActivities**](ActivitiesApi.md#getAllActivities) | **GET** /autocad.io/us-east/v2/Activities | Returns the details of all Activities.
[**patchActivity**](ActivitiesApi.md#patchActivity) | **PATCH** /autocad.io/us-east/v2/Activities(&#39;{id}&#39;) | Updates an Activity by specifying only the changed attributes.
[**setActivityVersion**](ActivitiesApi.md#setActivityVersion) | **POST** /autocad.io/us-east/v2/Activities(&#39;{id}&#39;)/Operations.SetVersion | Sets the Activity to the specified version.
[**updateActivity**](ActivitiesApi.md#updateActivity) | **PUT** /autocad.io/us-east/v2/Activities(&#39;{id}&#39;) | Updates an Activity by redefining the entire Activity object.


<a name="createActivity"></a>
# **createActivity**
> Activity createActivity(activity)

Creates a new Activity.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activity** | [**Activity**](Activity.md)|  |

### Return type

[**Activity**](Activity.md)

### Authorization

[oauth2_application](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.api+json, application/json

<a name="deleteActivity"></a>
# **deleteActivity**
> deleteActivity(id)

Removes a specific Activity.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2_application](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.api+json, application/json

<a name="deleteActivityHistory"></a>
# **deleteActivityHistory**
> deleteActivityHistory(id)

Removes the version history of the specified Activity.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2_application](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.api+json, application/json

<a name="getActivity"></a>
# **getActivity**
> Activity getActivity(id)

Returns the details of a specific Activity.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Activity**](Activity.md)

### Authorization

[oauth2_application](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.api+json, application/json

<a name="getActivityVersions"></a>
# **getActivityVersions**
> List&lt;Activity&gt; getActivityVersions(id)

Returns all old versions of a specified Activity.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**List&lt;Activity&gt;**](Activity.md)

### Authorization

[oauth2_application](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.api+json, application/json

<a name="getAllActivities"></a>
# **getAllActivities**
> List&lt;Activity&gt; getAllActivities()

Returns the details of all Activities.

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Activity&gt;**](Activity.md)

### Authorization

[oauth2_application](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.api+json, application/json

<a name="patchActivity"></a>
# **patchActivity**
> patchActivity(id, activity)

Updates an Activity by specifying only the changed attributes.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **activity** | [**ActivityOptional**](ActivityOptional.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2_application](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.api+json, application/json

<a name="setActivityVersion"></a>
# **setActivityVersion**
> setActivityVersion(id, activityVersion)

Sets the Activity to the specified version.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **activityVersion** | [**ActivityVersion**](ActivityVersion.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2_application](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.api+json, application/json

<a name="updateActivity"></a>
# **updateActivity**
> updateActivity(id, activity)

Updates an Activity by redefining the entire Activity object.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **activity** | [**Activity**](Activity.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2_application](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.api+json, application/json

