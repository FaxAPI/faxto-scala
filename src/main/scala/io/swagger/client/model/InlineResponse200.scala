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


case class InlineResponse200 (
  // The status of the API request
  status: Option[String] = None,
  // The id of the fax job. It is used to check the status of the fax job.
  faxJobId: Option[Integer] = None,
  // The remaining cash balance
  userCashBalance: Option[Number] = None,
  // The cost of sending fax
  cost: Option[Number] = None
)
