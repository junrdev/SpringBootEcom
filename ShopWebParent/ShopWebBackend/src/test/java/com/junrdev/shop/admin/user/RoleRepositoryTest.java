package com.junrdev.shop.admin.user;

import com.junrdev.common.entity.Role;
import com.junrdev.shop.admin.user.user.RoleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(value = false)
public class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void testCreateFirstRole(){
        Role admin = roleRepository.save(new Role("Admin", "Manage everything"));
        assert admin.getId() > 0;
    }

    @Test
    public void testCreateRemainingRoles(){
        roleRepository.saveAll(List.of(
                new Role("SalesPerson", "Manage product price, customers, shipping, orders and sales report."),
                new Role("Editor", "Manage categories, brands, products, articles and menus."),
                new Role("Shipper", "View products, view orders and update order status."),
                new Role("Assistan", "Manage question and reviews.")
        ));
    }
}
