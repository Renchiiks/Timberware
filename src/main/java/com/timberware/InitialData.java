package com.timberware;

import com.timberware.domain.*;
import com.timberware.repository.AssortmentGroupRepository;
import com.timberware.repository.AssortmentRepository;
import com.timberware.repository.DepartmentRepository;
import com.timberware.repository.SpeciesRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class InitialData implements ApplicationListener<ContextRefreshedEvent> {

    private final DepartmentRepository departmentRepository;
    private final AssortmentGroupRepository assortmentGroupRepository;

    private final SpeciesRepository speciesRepository;

    private final AssortmentRepository assortmentRepository;

    public InitialData(DepartmentRepository departmentRepository, AssortmentGroupRepository assortmentGroupRepository, SpeciesRepository speciesRepository, AssortmentRepository assortmentRepository) {
        this.departmentRepository = departmentRepository;
        this.assortmentGroupRepository = assortmentGroupRepository;
        this.speciesRepository = speciesRepository;
        this.assortmentRepository = assortmentRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("onAplicationEvent");
        if(departmentRepository.count()==0){
            loadDepartments();
        }

        if(assortmentGroupRepository.count()==0){
            loadAssortmentGroups();
        }

        if(speciesRepository.count()==0){
            loadSpecies();
        }
        if(assortmentRepository.count()==0){
            loadAssortments();
        }

    }


    private void loadDepartments() {
        Department department1 = new Department(1L, "Apaļkoks");
        departmentRepository.save(department1);
        Department department2 = new Department(2L, "Šķelda");
        departmentRepository.save(department2);

    }
    private void loadAssortmentGroups() {
        AssortmentGroup assortmentGroup1 = new AssortmentGroup(1L,"Kokmateriāli garenzāģēšanai");
        assortmentGroup1.setDepartment(departmentRepository.getReferenceById(1L));
        assortmentGroupRepository.save(assortmentGroup1);
        AssortmentGroup assortmentGroup2 = new AssortmentGroup(2L, "Kokmateriāli lobīšanai un drāšanai");
        assortmentGroup2.setDepartment(departmentRepository.getReferenceById(1L));
        assortmentGroupRepository.save(assortmentGroup2);
        AssortmentGroup assortmentGroup3 = new AssortmentGroup(3L,"Kokmateriāli pielietošanai apaļā veidā");
        assortmentGroup3.setDepartment(departmentRepository.getReferenceById(1L));
        assortmentGroupRepository.save(assortmentGroup3);
        AssortmentGroup assortmentGroup4 = new AssortmentGroup(4L,"Kurināmā koksne");
        assortmentGroup4.setDepartment(departmentRepository.getReferenceById(1L));
        assortmentGroupRepository.save(assortmentGroup4);
        AssortmentGroup assortmentGroup5 = new AssortmentGroup(5L,"Kokapstrādes blakusprodukti");
        assortmentGroup5.setDepartment(departmentRepository.getReferenceById(1L));
        assortmentGroupRepository.save(assortmentGroup5);
        AssortmentGroup assortmentGroup6 = new AssortmentGroup(6L,"Smalcinātā koksne");
        assortmentGroup6.setDepartment(departmentRepository.getReferenceById(1L));
        assortmentGroupRepository.save(assortmentGroup6);
        AssortmentGroup assortmentGroup7 = new AssortmentGroup(7L, "Kokmateriāli smalcināšanai");
        assortmentGroup7.setDepartment(departmentRepository.getReferenceById(2L));
        assortmentGroupRepository.save(assortmentGroup7);

    }
    private void loadSpecies() {
        Species species1 = new Species(1L, "Skuju koki", "SK", SpeciesType.CONIFEROUS_TREE );
        speciesRepository.save(species1);
        Species species2 = new Species(2L, "Priede", "P", SpeciesType.CONIFEROUS_TREE );
        speciesRepository.save(species2);
        Species species3 = new Species(3L, "Egle", "E", SpeciesType.CONIFEROUS_TREE );
        speciesRepository.save(species3);
        Species species4 = new Species(4L, "Lapegle", "LE", SpeciesType.CONIFEROUS_TREE );
        speciesRepository.save(species4);
        Species species5 = new Species(5L, "Citi skuju koki", "CSK", SpeciesType.CONIFEROUS_TREE );
        speciesRepository.save(species5);
        Species species6 = new Species(6L, "Lapu koki", "LK", SpeciesType.DECIDUOUS_TREE );
        speciesRepository.save(species6);
        Species species7 = new Species(7L, "Apse", "A", SpeciesType.DECIDUOUS_TREE );
        speciesRepository.save(species7);
        Species species8 = new Species(8L, "Baltalksnis", "BA", SpeciesType.DECIDUOUS_TREE );
        speciesRepository.save(species8);
        Species species9 = new Species(9L, "Melnalksnis", "MA", SpeciesType.DECIDUOUS_TREE );
        speciesRepository.save(species9);
        Species species10 = new Species(10L, "Bērzs", "B", SpeciesType.DECIDUOUS_TREE );
        speciesRepository.save(species10);
        Species species11 = new Species(11L, "Osis", "OS", SpeciesType.DECIDUOUS_TREE );
        speciesRepository.save(species11);
        Species species12 = new Species(12L, "Ozols ", "OZ", SpeciesType.DECIDUOUS_TREE );
        speciesRepository.save(species12);
        Species species13 = new Species(13L, "Liepa", "L", SpeciesType.DECIDUOUS_TREE );
        speciesRepository.save(species13);
        Species species14 = new Species(14L, "Cietie lapu koki", "CLK", SpeciesType.DECIDUOUS_TREE );
        speciesRepository.save(species14);
        Species species15 = new Species(15L, "Mīkstie lapu koki", "MLK", SpeciesType.DECIDUOUS_TREE );
        speciesRepository.save(species15);
        Species species16 = new Species(16L, "Jaukti koki", "JK", SpeciesType.MIXED_TREE );
        speciesRepository.save(species16);

    }

    private void loadAssortments() {
        //assortment1 name: Zāģbaļķi, assortmentGroup: Kokmateriāli garenzāģēšanai, department: "Apaļkoks", species: "Skuju koki"
        Assortment assortment1 = new Assortment("Zāģbaļķi");
        assortment1.setAssortmentGroup(assortmentGroupRepository.getReferenceById(1L));
        assortment1.setDepartment(departmentRepository.getReferenceById(1L));
        assortment1.setSpecies(speciesRepository.getReferenceById(1L));
        assortmentRepository.save(assortment1);

        Assortment assortment2 = new Assortment("I šķiras zāģbaļķi");
        assortment2.setAssortmentGroup(assortmentGroupRepository.getReferenceById(1L));
        assortment2.setDepartment(departmentRepository.getReferenceById(1L));
        assortment2.setSpecies(speciesRepository.getReferenceById(1L));
        assortmentRepository.save(assortment2);

        Assortment assortment3 = new Assortment("II sķiras zāģbaļķi");
        assortment3.setAssortmentGroup(assortmentGroupRepository.getReferenceById(1L));
        assortment3.setDepartment(departmentRepository.getReferenceById(1L));
        assortment3.setSpecies(speciesRepository.getReferenceById(1L));
        assortmentRepository.save(assortment3);

        Assortment assortment4 = new Assortment("III sķiras zāģbaļķi");
        assortment4.setAssortmentGroup(assortmentGroupRepository.getReferenceById(1L));
        assortment4.setDepartment(departmentRepository.getReferenceById(1L));
        assortment4.setSpecies(speciesRepository.getReferenceById(1L));
        assortmentRepository.save(assortment4);

        Assortment assortment5 = new Assortment("Taras kluči");
        assortment5.setAssortmentGroup(assortmentGroupRepository.getReferenceById(1L));
        assortment5.setDepartment(departmentRepository.getReferenceById(1L));
        assortment5.setSpecies(speciesRepository.getReferenceById(1L));
        assortmentRepository.save(assortment5);

        Assortment assortment6 = new Assortment("Dažāda garuma taras kluči");
        assortment6.setAssortmentGroup(assortmentGroupRepository.getReferenceById(1L));
        assortment6.setDepartment(departmentRepository.getReferenceById(1L));
        assortment6.setSpecies(speciesRepository.getReferenceById(1L));
        assortmentRepository.save(assortment6);

        Assortment assortment7 = new Assortment("Dažāda garuma III šķiras zāģbaļķi");
        assortment7.setAssortmentGroup(assortmentGroupRepository.getReferenceById(1L));
        assortment7.setDepartment(departmentRepository.getReferenceById(1L));
        assortment7.setSpecies(speciesRepository.getReferenceById(1L));
        assortmentRepository.save(assortment7);

        Assortment assortment8 = new Assortment("Finierkluči");
        assortment8.setAssortmentGroup(assortmentGroupRepository.getReferenceById(2L));
        assortment8.setDepartment(departmentRepository.getReferenceById(1L));
        assortment8.setSpecies(speciesRepository.getReferenceById(1L));
        assortmentRepository.save(assortment8);

        Assortment assortment9 = new Assortment("I šķiras finierkluči");
        assortment9.setAssortmentGroup(assortmentGroupRepository.getReferenceById(2L));
        assortment9.setDepartment(departmentRepository.getReferenceById(1L));
        assortment9.setSpecies(speciesRepository.getReferenceById(1L));
        assortmentRepository.save(assortment9);

        Assortment assortment10 = new Assortment("II šķiras finierkluči");
        assortment10.setAssortmentGroup(assortmentGroupRepository.getReferenceById(2L));
        assortment10.setDepartment(departmentRepository.getReferenceById(1L));
        assortment10.setSpecies(speciesRepository.getReferenceById(1L));
        assortmentRepository.save(assortment10);

    }


}
