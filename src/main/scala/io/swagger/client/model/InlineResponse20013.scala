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


case class InlineResponse20013 (
  // The status of the API request
  status: Option[String] = None,
  // States data
  states: Option[List[InlineResponse20013States]] = None
)

