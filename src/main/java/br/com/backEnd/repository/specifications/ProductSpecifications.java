package br.com.backEnd.repository.specifications;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import br.com.backEnd.model.Product;

@Component
public class ProductSpecifications {

    public static Specification<Product> getSpec(String productName, Double productPrice, String vendorName){
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicate = new ArrayList<>();
            if(productName != null && !(productName.isEmpty())){
                predicate.add(criteriaBuilder.and(
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("descrProduct")),  "%"+ productName +"%"),
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("descrProduct")),  "%"+ productName +"%")));
            }if(productPrice != null){
                predicate.add(
                    criteriaBuilder.lessThanOrEqualTo(root.get("priceProduct"), productPrice));
            }if(vendorName != null){
                predicate.add(
                    criteriaBuilder.like(
                    criteriaBuilder.lower(root.join("vendor",JoinType.LEFT).get("providerSeller")),  "%"+ vendorName +"%"));
            }

            /*
            if(productDescr != null && !(productDescr.isEmpty())){
                predicate.add(
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("DescrProduct")),  "%"+ productDescr +"%"));
            }*/
            return criteriaBuilder.and(predicate.toArray(new Predicate[0]));
    };
    } 
}
