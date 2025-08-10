
    set client_min_messages = WARNING;

    alter table if exists bici 
       drop constraint if exists FK20w9irhi2ejvwwsnhd7mj8pwl;

    alter table if exists bici 
       drop constraint if exists FKswktcdeh5uuwbhf8ducphchxo;

    alter table if exists macchina 
       drop constraint if exists FKktm44xfs8hvv5evg3gdfq50u3;

    alter table if exists moto 
       drop constraint if exists FK45syifcllae09quumt3uhcckk;

    alter table if exists veicolo 
       drop constraint if exists FKmulkx4clibsa9a7v0hkv33yq2;

    alter table if exists veicolo 
       drop constraint if exists FKadjynej4kplqqaia8h3t3w5m7;

    alter table if exists veicolo 
       drop constraint if exists FK1c8wuj83gmqgnjcyerakq2vge;

    alter table if exists veicolo 
       drop constraint if exists FKl2uxral8sefwlju24c4sx1fmw;

    drop table if exists alimentazione cascade;

    drop table if exists bici cascade;

    drop table if exists categoria cascade;

    drop table if exists colore cascade;

    drop table if exists macchina cascade;

    drop table if exists marca cascade;

    drop table if exists moto cascade;

    drop table if exists sospensione cascade;

    drop table if exists veicolo cascade;
