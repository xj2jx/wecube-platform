<template>
  <div>
    <Table :columns="tableColumns" :data="tableData"></Table>
  </div>
</template>

<script>
import { getSysParams } from "@/api/server";
export default {
  name: "sys-params",
  data() {
    return {
      tableData: [],
      tableColumns: [
        {
          title: this.$t("source"),
          key: "scopeType"
        },
        {
          title: this.$t("name"),
          key: "name"
        },
        {
          title: this.$t("table_value"),
          key: "value"
        },
        {
          title: this.$t("description"),
          key: "description"
        },
        {
          title: this.$t("status"),
          key: "status"
        }
      ]
    };
  },
  watch: {
    pkgId: {
      handler: () => {
        this.getData();
      }
    }
  },
  props: {
    pkgId: {
      required: true,
      type: Number
    }
  },
  created() {
    this.getData();
  },
  methods: {
    async getData() {
      let { status, data, message } = await getSysParams(this.pkgId);
      if (status === "OK") {
        this.tableData = data;
      }
    }
  }
};
</script>
