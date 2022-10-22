package com.sengar.api.composite.product;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Api(description= "REST API for composite product information.")
public interface ProductCompositeService {
      
      /**
       * Sample Usage: curl $HOST:$PORT/product-composite/1
       * @param productId
       * @return composite product info, if found, else null
       */
       @ApiOperation(
           value = "${api.product-composite.get-composite-product.description}",
           notes = "${api.product-composite.get-composite-product.notes}")
       @ApiResponses(value = {
           @ApiResponse(code = 400, message = "Bad Request, invalid format of the request exists, see the response message for more information"),
           @ApiResponse(code = 404, message = "Not Found, the specified product id does'nt exits"),
           @ApiResponse(code = 422, message = "Unprocessable entity, input parameters caused the processing to fails, See the response message.")
       })
       @GetMapping(
          value = "/product-composite/{productId}",
          produces = "application/json")
       ProductAggregate getProduct(@PathVariable int proudctId);
}
