package com.company.demo.controller.admin;

import com.company.demo.model.dto.PageableDto;
import com.company.demo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ManageProductRestController {

  @Autowired
  private ProductService productService;

  @GetMapping("/api/admin/restProducts")
  public PageableDto getProductManageRest(@RequestParam(defaultValue = "1") int page,
                                          @RequestParam(defaultValue = "product.created_at") String order,
                                          @RequestParam(defaultValue = "desc") String direction,
                                          @RequestParam(defaultValue = "") String id,
                                          @RequestParam(defaultValue = "") String name,
                                          @RequestParam(defaultValue = "%%") String brand,
                                          @RequestParam(defaultValue = "%%") String category) {
    if (!direction.toLowerCase().equals("desc")) {
      direction = "asc";
    }

    // Get list product
    PageableDto rs = productService.adminGetListProduct(id, name, category, brand, order, direction, page);

    return rs;
  }

}
