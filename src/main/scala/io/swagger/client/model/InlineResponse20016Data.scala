/**
 * Fax.to REST API client for Scala
 * This is Fax.to REST API client for Scala.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: inquiries@fax.to
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class InlineResponse20016Data (
  id: Option[Integer] = None,
  didId: Option[Integer] = None,
  didGroupId: Option[Integer] = None,
  countryCode: Option[String] = None,
  cityName: Option[String] = None,
  areaCode: Option[String] = None,
  number: Option[String] = None,
  `type`: Option[String] = None,
  trunkId: Option[Integer] = None
)
