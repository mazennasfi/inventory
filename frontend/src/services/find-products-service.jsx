import axios from "axios";

const getProducts = (id) => {
  return axios.get(`http://localhost:8011/codeonce/v1/${id}`);
};

export default {
  getProducts,
};
